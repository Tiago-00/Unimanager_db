package pt.iade.unimanager_db.models.ids;

import java.io.Serializable;

public class EnrolmentId implements Serializable {
    private static final long serialVersionUID = 1L;
    private int studentId;
    private int courseId;
    private int unitId;

    public EnrolmentId() {
    }

    public EnrolmentId(int studentId, int courseId, int unitId) {
      this.studentId = studentId;
      this.courseId = courseId;
      this.unitId = unitId;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getStudentId() {
      return studentId;
    }

    public void setStudentId(int studentId) {
      this.studentId = studentId;
    }

    public int getCourseId() {
      return courseId;
    }

    public void setCourseId(int courseId) {
      this.courseId = courseId;
    }

    public int getUnitId() {
      return unitId;
    }

    public void setUnitId(int unitId) {
      this.unitId = unitId;
    }
}
