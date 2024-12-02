@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);

    assertEquals("Ошибка, 19 возраст совершеннолетия", true, isAdult);
}