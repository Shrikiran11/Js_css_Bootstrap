class Zoo {
    int animalCount;

    Zoo() {

    }

    private Zoo(int an) {
        animalCount = an;
    }

    public static void main(String[] args) {
        Zoo z = new Zoo(92);
        System.out.println(z.animalCount);
    }
}// Zoo(int) has private access in Zoo