/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kan.mathutil.main;

import com.kan.mathutil.core.MathUtility;

/**
 *
 * @author STEALTH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test case #1 xem mô tả chi tiết ở dưới
        int n = 0; //hàm ý kiểm tra 0!
        long expected = 1; //hàm ý rằng, hy vọng rằng n = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); // thực tế là mấy, gọi hàm là biết ngay
        
        System.out.println(n + "! -> expected: " + expected +
                                         "| actual: " + actual);
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected +
                                         "| actual: " + actual);
    }
    
}
//DÂN DEV VIẾT RA CODE: HÀM, CLASS ĐỒNG THỜI PHẢI CÓ TRÁCH NHIỆM 
//TEST CODE CỦA CHÍNH MÌNH LÀM RA
//LÀM SAO ĐỂ TEST CODE CỦA CHÍNH MÌNH
//CÓ 3 CÁCH
//CÁCH 1: IN RA MÀN HÌNH KẾT QUẢ XỬ LÍ CỦA HÀM
//CÁCH 2: IN RA LOG FILE
//CÁCH 3: DÙNG ĐỒ CHƠI BÊN NGOÀI ĐEM VÀO - THƯ VIỆN ĐEM VÀO!!!!!

//NHƯNG DÙ LÀ KIỂM THỬ THẾ NÀO THÌ CÙNG GỒM 3 CÔNG VIỆC
//THIẾT KẾ TEST CASE
//THỰC THI TEST CASE - TEST RUN
//GHI BUG NẾU CÓ = LOG BUG

//TEST CASE LÀ: BỘ DATA ĐƯA VÀO APP ĐỂ XEM APP HÀNH XỬ ĐÚNG KO
//              KÈM THÊM EXPECTED VALUE ĐỂ XEM APP TRẢ VỀ GIỐNG KO
//              KÈM THÊM HƯỚNG DẪN SỬ DỤNG APP VỚI DATA ĐƯA VÀO
//              KÈM THÊM TRẠNG THÁI CỦA TEST CASE: APP ĐÚNG HAY SAI

//CẤU TRÚC 1 TEST CASE NHƯ SAU
//(DÙNG TRONG THỰC TẾ ĐI LÀM, VÀ ĐÚNG TRONG BÀI THI PE)

//MỘT TEST CASE GỒM NHỮNG INFO SAU:
//TEST CASE ID | TEST CASE DESCRIPTION | STEPS/PROCEDURES
//EXPECTED RESULT | STATUS (PASSED | FAILED)

//TEST CASE LÀ TÌNH HUỐNG XÀI APP VỚI BỘ DATA ĐƯA VÀO VÀ GIÁ TRỊ KÌ VỌNG APP PHẢI TRẢ VỀ
//GIỜ TA MUỐN TEST HÀM GETF() TA PHẢI THIẾT KẾ CÁC TEST CASE COI XEM HÀM TRẢ VỀ ĐÚNG KO

//TEST CASE #1: VERIFY getFactorial(with n = 0) check 0! correct or not?
//TEST STEPS/ PROCEDURES
//          1. Given n = 0
//          2. Call/invoke getFactorial(n = 0)

//EXPECTED RESULT:
//          The method must return 1 as the result of 0!

// STATUS: PASSED | FAILED, just waiting the method returns value
//                  ĐOÁN XEM !!!!!


// Câu 3 bài thi PE viết ra khoảng 10 cái TEST CASE như trên

// TEST CASE #2: VERIFY getFactorial(with n = 5) check 5! correct or not?
// TEST STEPS/ PROCEDURES
//          1. Given n = 5
//          2. Call/invoke getFactorial(n = 5)

// EXPECTED RESULT:
//          The method must return 120 as the result of 5!

// STATUS: PASSED | FAILED, just waiting the method returns value