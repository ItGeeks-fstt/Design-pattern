package before;

public class Main {
    public static void main(String[] args) {
//        ? Problem
//      create me phones with type
//        a) with type c and with two camera face and back camera
//        b) with type c but without a back camera
//        c) with type usb micro 2 with two camera
//        d) with type usb micro 2 with a back camera only
//        ..... simple phone with all the possible combinations ..
//        -> another problem we will have that they will be some combinations that have the same code replicated twice
//        which against the dry principal ( don't repeat your self)
//        -> you notice that we have a lot of combination that will increase dramatically with adding a new
//        feature or what we will call a behavior
//        -> the solution to inheritance is not more inheritance and will be in  inheritance hell problem
//        we can solve that with vertical inheritance which good .but we can't share behavior horizontally
//                                       smartPhone
//                                      |       |                                   |
//        smartPhoneWithTypeCAndTwoCameras   smartPhoneWithTypeCAndFrontCameraOnly   SimplePhone
//                |                                  |                                  |    |
//               S6                                                                  SimplePhoneWithUsb2MircoNoCamea ....
//        that's getting frustrating  and getting worse with all the possibilities

//        you see even thinking about the problem make you don't want to try even to create all the combinations that will be spaghetti code

//    the solution is a solid principal called strategy which is by definitions means
//         the  strategy  pattern defines a family of algorithms  encapsulate each one and make them interchangeably used
//        strategy lets the algorithm vary independently of the client that use them
//         (definition from head first design patterns book)

//        cons : hard to step first time (too verbose (to much code)) but easy to maintain and extend later
    }
}