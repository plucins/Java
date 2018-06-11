package model;

import javax.persistence.*;
import java.time.LocalDate;

@NamedNativeQueries({
        @NamedNativeQuery(name = "carByBrand",
                query = "SELECT * From Car c where c.brand = :brand order by c.brand",
                resultClass = Car.class
        )
})


@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private CarBody carBody;
    private LocalDate productionDate;
    private int yearsCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public int getYearsCount() {
        return yearsCount;
    }

    public void setYearsCount(int yearsCount) {
        this.yearsCount = yearsCount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carBody=" + carBody +
                ", productionDate=" + productionDate +
                ", yearsCount=" + yearsCount +
                ", person=" + person +
                '}';
    }
}
