public enum ProgrammingLanguage {
    JAVA(1995, ""),
    PYTHON(1991, ""),
    C(1972, ""),
    RUBY(1995, "");

    final int yearCreated;
    final String author;

    ProgrammingLanguage(int yearCreated, String author) {
        this.yearCreated = yearCreated;
        this.author = author;
    }
}
