package com.kan.mathutil.core;

// Class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
// Cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm, mà ko cần lưu trữ gì hết, cái đó nên là static
// Đồ nào mà là STATIC thì gọi trực tiếp qua tên class
// Không bao giờ gọi STATIC qua con đường NEW!!!
public class MathUtility {
    public static final double PI = 3.14;
    //C#: public const double PI = 3.14; //ko cần chữ static mà vẫn là static nếu có từ khóa const
                                         // const C# ~ final Java
    //Hàm tính từ n! = 1,2,3,4....n
    //không có giai thừa của số âm, N < 0 không tính được
    //Nếu N quá lớn thì tràn kiểu long, long chỉ chịu được 18 số 0
    // 20! vừa đủ số 0, do đó: Không tính giai thừa từ 21 trở đi
    // 0! = 1! = 1 - Quy ước
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        if (n == 0 || n == 1)
            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay
        
        return n * getFactorial(n - 1); //đệ quy xong
    }
    //ĐỆ QUY - RECURSION
    //BÚP BÊ NGA - ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //                    NHỎ ĐẾN 1 MỨC THÌ DỪNG LẠI
    //5! = 1.2.3.4. 5
    //4! =       4! X 5
    //4! = 1.2.3.  4
    //4! =     3! X 4
    //3! = 3 X 2!
    //2! = 2 X 1!   DỪNG NGAY
    //N! = N X (N - 1)!
    
    
    // KĨ THUẬT KIỂM THỬ HỒI QUY - RECURSION TEST
    // TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST ĐỂ XÁC NHẬN NÓ CÒN CÓ ỔN KO
    // TẠI SAO PHẢI TEST LẠI???
    // CODE THEO THỜI GIAN SẼ CÓ THAY ĐỔI, THAY ĐỔI VÌ
    //1. ANH EM FIX BUG, SẼ SỬA CODE
    //2. ANH EM TỐI ƯU, CHỈNH SỬA CODE ĐỂ CODE ĐẸP HƠN, CHẠY TỐT HƠN, NHANH HƠN
    //3. ANH EM THÊM HÀM MỚI, METHOD MỚI
    
    // KHI SỬA CODE, PHẢI TEST LẠI ĐỂ ĐẢM BẢO NÓ VẪN NGON, VẪN XANH
    // NẾU TEST = TAY CỰC KÌ MẤT SỨC, COI CHỪNG SAI SÓT
    // NẾU CÓ TEST SCRIPT, TA CHỈ VIỆC RUN, VÀ NHÌN MÀU ĐƯA RA
    // NẾU MÀU XANH, CODE CHỈNH SỬA ỔN, VÌ THỎA EXPECTED == ACTUAL
    // NẾU MÀU ĐỎ, CODE KO ỔN, SỬA TIẾP CHO ĐẾN KHI NÀO ỔN
    // TA TEST LẠI MÀ CHỈ CẦN NHÌN MÀU -> NHANH, KO HAO SỨC, CHÍNH XÁC
    // MIỄN ĐỦ TEST CASE, TEST SCRIPT
    
    // TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST GỌI LÀ TEST HỒI QUY RECURSION
    
    
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
//        if (n == 0 || n == 1)
//            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay
//        
//        //sống sót đến chỗ này, sure n = 2...20. Vì nếu ko chết dọc đường ở 
//        // 2 cụm if ở trên rồi, KO CẦN ELSE NẾU CÓ RETURN
//        long result = 1; //giai thừa khởi đầu là 1
//        //nhân dồn 2 3 4 5........n vào biến này thì thành n!
//        
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
