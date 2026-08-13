class Rectangulo{

    double base;
    double altura;

    public Rectangulo(double base, double altura){

     this.base = base;
     this.altura = altura;

    }

double calcularArea(){

 return this.base * this.altura;
}

double calcularPerímetro(){

return 2 * (this.base + this.altura);
}


void mostrarResultados(){
System.out.println("=====================================");
System.out.println("Altura del rectangulo: " + altura);
System.out.println("Base del rectangulo: " + base);
System.out.println("Area : " + calcularArea());
System.out.println("Perimetro: " + calcularPerímetro());
System.out.println("=====================================");
}

public static void main(String[] args) {
    
    Rectangulo rec1 = new Rectangulo(32.4 , 50);
    Rectangulo rec2 = new Rectangulo(24.65 , 49.32);

rec1.calcularArea();
rec1.calcularPerímetro();
rec1.mostrarResultados();

rec2.calcularPerímetro();
rec2.calcularArea();
rec2.mostrarResultados();

}
}
