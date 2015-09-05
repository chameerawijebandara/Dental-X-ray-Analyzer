/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

/**
 *
 * @author Minudika
 */
public class DataSet {
    private String imageUrl_before;
    private String imageUrl_after;
    private String doctorName;
    private String hospitalName;
    private String hospitalContact;

    public DataSet(String urlB,String urlA,String docName,String hosName,String hosContact) {
        imageUrl_after=urlA;
        imageUrl_before=urlB;
        doctorName=docName;
        hospitalContact=hosContact;
        hospitalName=hosName;
    }

    /**
     * @return the imageUrl_before
     */
    public String getImageUrl_before() {
        return imageUrl_before;
    }

    /**
     * @param imageUrl_before the imageUrl_before to set
     */
    public void setImageUrl_before(String imageUrl_before) {
        this.imageUrl_before = imageUrl_before;
    }

    /**
     * @return the imageUrl_after
     */
    public String getImageUrl_after() {
        return imageUrl_after;
    }

    /**
     * @param imageUrl_after the imageUrl_after to set
     */
    public void setImageUrl_after(String imageUrl_after) {
        this.imageUrl_after = imageUrl_after;
    }

    /**
     * @return the doctorName
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * @param doctorName the doctorName to set
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * @return the hospitalName
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName the hospitalName to set
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * @return the hospitalContact
     */
    public String getHospitalContact() {
        return hospitalContact;
    }

    /**
     * @param hospitalContact the hospitalContact to set
     */
    public void setHospitalContact(String hospitalContact) {
        this.hospitalContact = hospitalContact;
    }
    
    
    
}
