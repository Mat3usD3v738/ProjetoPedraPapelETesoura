package S_Heranca.dominio ;

public class Tomate extends Produto{
/*
 * @param data babla
 */
protected int dia , mes , ano ; 



 private  String data ; 
public void setData(int dia, int mes,  int ano){

this.data =  dia+"\\"+mes+ "\\"+ano ; 
}
public String getData(int dia, int mes,  int ano){
this.data =  dia+"\\"+mes+ "\\"+ano ; 
    return this.data ; 
    }
@Override
public String toString() {
    return  nome;
}
public int getDia() {
    return dia;
}
public void setDia(int dia) {
    this.dia = dia;
}
public int getMes() {
    return mes;
}
public void setMes(int mes) {
    this.mes = mes;
}
public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
public String getData() {
    return data;
}
public void setData(String data) {
    this.data = data;
}






}



