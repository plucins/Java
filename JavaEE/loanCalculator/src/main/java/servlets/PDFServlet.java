package servlets;

import Pojo.Installment;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@WebServlet("/pdf")
public class PDFServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Installment> installments = (List<Installment>) session.getAttribute("schedule");

        resp.setContentType("application/pdf");
        resp.setHeader("Content-Type","application/x-www-form-urlencoded");
        resp.setHeader("Content-disposition","attachment; filename='calculation.pdf'");
        createPdf(installments,resp);
    }

    private void createPdf(List<Installment> installments, HttpServletResponse resp){

        Document document = new Document(PageSize.A4);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            ServletOutputStream servletOutputStream = resp.getOutputStream();
            PdfWriter writer = PdfWriter.getInstance(document, servletOutputStream);
            document.open();
            PdfPTable table = new PdfPTable(5);
            table.addCell("#");
            table.addCell("Kwota kapitalu");
            table.addCell("Kwota odsetek");
            table.addCell("Oplaty stale");
            table.addCell("Kwota laczna");
            for(Installment i: installments){
                table.addCell(""+i.getNumber());
                table.addCell(""+i.getCapital());
                table.addCell(""+i.getInterest());
                table.addCell(""+i.getFixedFees());
                table.addCell(""+i.getTotalAmount());
            }
            out.writeTo(servletOutputStream);
            document.add(table);
            document.close();

        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
