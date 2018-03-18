package Controller;

import Pojo.Calculation;
import Pojo.Installment;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculationControllerTest {


    List<Installment> installments = new ArrayList<>();
    List<Installment> installmentList = new ArrayList<>();
    CalculationController c = new CalculationController();
    Calculation calcConstans;
    Calculation calcDiminishing;

    @Before
    public void setup(){
        installments.add(new Installment(1,2000,50,2020));
        installments.add(new Installment(2,3000,50,3020));
        installments.add(new Installment(3,4000,50,4020));
        installments.add(new Installment(4,5000,50,5020));
        calcConstans = new Calculation("1000","4","3","200","constans",installments) ;
        calcDiminishing = new Calculation("1000","4","3","200","diminishing",installments) ;
    }

    @Test
    public void pobierzHarmonogram_rozmiarHarmonogramu_staleRaty() {
        //when
        installmentList = c.pobierzHarmonogram(calcConstans);

        //then
        assertThat(installments.size() == installmentList.size()).isTrue();
    }
    @Test
    public void pobierzHarmonogram_wysokoscKapitalu_staleRaty(){
        //when
        installmentList = c.pobierzHarmonogram(calcConstans);
        int sum = 0;
        for(Installment  i : installmentList){
            sum += i.getCapital();
        }
        //then

        assertThat(sum).isEqualTo(Integer.parseInt(calcConstans.getLoanValue()));
    }

    @Test
    public void pobierzHarmonigram_WysokoscPojedynczegoKosztuStalego_staleRaty(){
        //when
        installmentList = c.pobierzHarmonogram(calcConstans);
        int suma = 0;
        for(Installment i : installments){
            suma += i.getFixedFees();
        }
        //then
        assertThat(suma).isEqualTo(Integer.parseInt(calcConstans.getFixedFees()));
    }

    @Test
    public void pobierzHarmonogram_rozmiarHarmonogramu_malejaceRaty() {
        //when
        installmentList = c.pobierzHarmonogram(calcDiminishing);

        //then
        assertThat(installments.size() == installmentList.size()).isTrue();
    }
    @Test
    public void pobierzHarmonogram_wysokoscKapitalu_malejaceRaty(){
        //when
        installmentList = c.pobierzHarmonogram(calcDiminishing);
        int sum = 0;
        for(Installment  i : installmentList){
            sum += i.getCapital();
        }
        //then

        assertThat(sum).isEqualTo(Integer.parseInt(calcDiminishing.getLoanValue()));
    }

    @Test
    public void pobierzHarmonigram_WysokoscPojedynczegoKosztuStalego_malejaceRaty(){
        //when
        installmentList = c.pobierzHarmonogram(calcDiminishing);
        int suma = 0;
        for(Installment i : installments){
            suma += i.getFixedFees();
        }
        //then
        assertThat(suma).isEqualTo(Integer.parseInt(calcDiminishing.getFixedFees()));
    }







}