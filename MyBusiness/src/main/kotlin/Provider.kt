/*FORNECEDOR*/
class Provider(name: String,
               surname: String,
               val product: String
) : People(name, surname) {

    fun getProviderInfos() = "Name: $name, Surname: $surname, Product: $product"
}