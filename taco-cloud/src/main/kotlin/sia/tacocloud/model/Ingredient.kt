package sia.tacocloud.model


data class Ingredient(
        val id: String? = null,
        val name: String? = null,
        val type: Type? = null
) {
    enum class Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}

