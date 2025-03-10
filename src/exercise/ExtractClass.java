package exercise;

public class ExtractClass {
	// commit 2
    class TelephoneNumber {
        private String officeAreaCode;
        private String officeNumber;

        public String getTelephoneNumber() {
            return "(" + officeAreaCode + ") " + officeNumber;
        }

        public String getOfficeAreaCode() {
            return officeAreaCode;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            this.officeAreaCode = officeAreaCode;
        }

        public String getOfficeNumber() {
            return officeNumber;
        }

        public void setOfficeNumber(String officeNumber) {
            this.officeNumber = officeNumber;
        }
    }

    class Person {
        private String name;
        private TelephoneNumber telephoneNumber = new TelephoneNumber(); // Komposisi

        public String getName() {
            return name;
        }

        public String getTelephoneNumber() {
            return telephoneNumber.getTelephoneNumber();
        }

        public String getOfficeAreaCode() {
            return telephoneNumber.getOfficeAreaCode();
        }

        public void setOfficeAreaCode(String arg) {
            telephoneNumber.setOfficeAreaCode(arg);
        }

        public String getOfficeNumber() {
            return telephoneNumber.getOfficeNumber();
        }

        public void setOfficeNumber(String arg) {
            telephoneNumber.setOfficeNumber(arg);
        }
    }
}
