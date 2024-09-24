class BankAccount(deposited: Long,withdrawm:Long){
    var depo = deposited
    var with = withdrawm
    var balance = deposited - withdrawm
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}