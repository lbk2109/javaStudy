package javaStudy;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMAIL = "FEMAIL";

	enum Gender {
		MALE, FEMALE
	}

	enum Currency {
		PENNY, NICKLE, DIME, QUARTER
	}

	public enum MyType {
		ONE {
			public String toString() {
				return "this is one";
			}
		},

		TWO {
			public String toString() {
				return "this is two";
			}
		}
	}

	public static void main(String[] args) {

		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMAIL;
		System.out.println(gender1);

		System.out.println("------------------------");
		// CASE1

		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;

		System.out.println(gender2);

		for (Gender gender : Gender.values()) {
			System.out.println(gender.ordinal());
			System.out.println(gender);
			System.out.println(gender.name());
		}
		System.out.println("------------------------");

		// CASE2
		for (Currency currency : Currency.values()) {
			System.out.println(currency.ordinal());
			System.out.println(currency);
			System.out.println(currency.name());
		}

		Currency usCoin = Currency.DIME;
		System.out.println(usCoin);

		System.out.println("------------------------");

		// CASE3
		for (MyType mytype : MyType.values()) {
			System.out.println(mytype.ordinal());
			System.out.println(mytype);
			System.out.println(mytype.name());
		}
		System.out.println(MyType.ONE);
		System.out.println(MyType.TWO);

	}

}
