public class Test {

    public enum Day {
        SATURDAY("Sabado", "土曜日"),
        SUNDAY( "Domingo", "日曜日");

        private String spanish;
        private String japanese;

        private Day( String s, String j){
            spanish = s;
            japanese = j;
        }

        public String getJapanese() {
            return japanese;
        }

        public String getSpanish() {
            return spanish;
        }
    }

    public static void main(String[] args) {

        Day day = Day.SATURDAY;

        switch (day) {
            case SATURDAY:
                System.out.println("Spanish: " + day.getSpanish() +
                                   ", Japanse: " + day.getJapanese());
                break;
            default:
                System.out.println("Midweek are so-so");
                break;
        }
    }
}
