import java.util.Scanner

fun phanTich1(n: Int) {
    var n = n
    var i = 2
    while (n > 0) {
        if (n % i == 0) {
            if (n == i) {
                print(i)
                break
            } else
                print("$i*")
            n /= i
        } else
            i++
    }
}

internal fun tong1(n: Int): Int {
    var n = n
    var tg = 0
    while (n > 0) {
        tg += n % 10
        n /= 10
    }
    return tg
}

fun main(args:Array<String>) {
    println("Số nguyên là: ")
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println("tổng các chữ số là: " + tong1(n))
    print("phan tich n thanh cac thua so nguyen to: ")
    phanTich1(n)
    println("")
}
