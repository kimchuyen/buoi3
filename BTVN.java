public class BTVN {
    float cv;
    float dt;
    float cd= 15;
    float cr = 7;
    float r = 8;
float chuvi(){
    cv= (cd+cr)*2;
    System.out.println("chu vi hình vuông là:"+cv);
    return (cv);

}
float dientich(){
    dt= cd*cr;
    System.out.println("dien tich hình vuông là:"+dt);
    return (dt);

}
float hinhtron(){
    float cvht;
    cvht= (float) 3.14*2*r;
    System.out.println("dien tich hình tron là:"+cvht);
    return (cvht);

}


}
