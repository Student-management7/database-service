package EasyWaySolution.database_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class FacultyInfo {

    @Id
    private UUID fact_id;
    private String fact_Name;
    private String fact_email;
    private String fact_contact;
    private String fact_gender;
    private String fact_address;
    private String fact_city;
    private String fact_state;
    private String fact_joiningDate;
    private String fact_leavingDate;

    private boolean isDelete = false;

   @Column(columnDefinition = "text")
   private String fact_graduation;

   @Column(columnDefinition = "text")
   private String fact_postGraduation;

   @Column(columnDefinition = "text")
   private String fact_other;

   @Column(columnDefinition = "text")
   private String fact_cls;

   @Column(columnDefinition = "text")
   private String fact_status;



}
