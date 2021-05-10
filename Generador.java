

public class Generador{
 public String Generador1(int n){
  int conteo;
  int i;
  int incr;
  String reporte;
   if(n > 0){
    boolean aum;
    aum     = true;
    conteo  = 1;
    reporte = "1";
    incr    = 1;
    i       = 1;
    while(i < n){
      switch(incr){
            case 1:
             incr++;
             i++;
             conteo += 1;
             reporte += registrar(conteo);
            break;
            case 2:
             if(aum == true){
                incr++;
                i++;
                conteo  += 2;
                reporte += registrar(conteo);
                aum      = false;
             }else{
                   incr--;
                   i++;
                   conteo  += 2;
                   reporte += registrar(conteo);
                   aum      = true;
             }
            break;
            case 3:
             incr--;
             i++;
             conteo  += 3;
             reporte += registrar(conteo);
            break;
            }  
                             
       }
   }else{
          reporte = "Entrada no valida";  
         }
  return reporte;
 }
 private String registrar(int c){
    String reporte;
    reporte = " " + c;
    return reporte;
    }
 public String padovan(int n){
    String reporte;
    int cont;
    int i;
    if(n > 0){
       i       = 1;
       cont    = 1;
       reporte = "" + cont;
       if(n > i ){
          while(n > i && i < 3){
               reporte += registrar(cont) ;
               i++;
          }
       }
       if(n > 3){
           int x;
           int y;
           int z;
           x =1;
           y = 1;
           z = 1;
           while(n > i){
                 cont     = x + y;
                 reporte += registrar(cont);
                 x        = y;
                 y        = z;
                 z        = cont;
                 i++;
           }
       }
    }else{
          reporte = "Entrada no valida";
    }
    return reporte;
 }
}
