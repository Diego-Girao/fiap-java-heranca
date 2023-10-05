package com.fiap.heranca;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAlimenta("Todo animal se alimenta");
        animal.setLocomove("Todo animal se locomove");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimenta("Cachorro come ração de cachorro");
        cachorro.setLocomove("Cachorro anda em 4 patas");
        cachorro.setLatido("Cachorro faz Au Au Au!");

        Animal pug = new Cachorro();
        pug.setAlimenta("Pug come ração especial de cachorro");
        pug.setLocomove("Pug anda em 4 patas");
    }
}
