package enumtype.week;

public enum Day {
  H(DayType.WORKDAY), K(DayType.WORKDAY), SZE(DayType.WORKDAY), CS(DayType.WORKDAY), P(DayType.WORKDAY), SZO(DayType.HOLYDAY), V(DayType.HOLYDAY);
private DayType b;
    Day(DayType b) {
    this.b = b;
    }

    public DayType getB() {
        return b;
    }
}
