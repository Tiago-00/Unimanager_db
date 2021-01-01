package pt.iade.unimanager_db.models.ids;

import java.io.Serializable;

public class PlanId implements Serializable {
    private static final long serialVersionUID = 1L;
    private int unitId;
    private int courseId;

    public PlanId() {
    }

    public PlanId(int unitId, int courseId) {
      this.unitId = unitId;
      this.courseId = courseId;
    }

    public int getUnitId() {
      return unitId;
    }

    public void setUnitId(int unitId) {
      this.unitId = unitId;
    }

    public int getCourseId() {
      return courseId;
    }

    public void setCourseId(int courseId) {
      this.courseId = courseId;
    }
}