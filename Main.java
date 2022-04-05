class Main {
  public static void main(String[] args) {
   
   double[] Liczba = new double[10];
     Liczba [0] = 43.5;
     Liczba [1] = 34.0;
     Liczba [2] = 23.0;
     Liczba [3] = 55.0;
     Liczba [4] = 23.5;
     Liczba [5] = 44.5;
     Liczba [6] = 63.0;
     Liczba [7] = 15.0;
     Liczba [8] = 33.5;
     Liczba [9] = 64.5;
    double suma=0,n=1,wynik;
    for (int i=0;i<10;i++)
      {
        suma= suma + Liczba [i];
        n++;
      }
    
 wynik = suma/n;
    System.out.println("wynik to "+ wynik);
    
  }
}
