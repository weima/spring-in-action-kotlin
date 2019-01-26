package sia.tacocloud.controller

import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import sia.tacocloud.model.Ingredient
import sia.tacocloud.model.Ingredient.Type
import sia.tacocloud.model.Taco
import java.util.*


@Slf4j
@Controller
@RequestMapping("/design")
class DesignTacoController {
    private fun filterByType(
            ingredients: List<Ingredient>, type: Type): List<Ingredient> {
        return ingredients.filter { (_, _, type1) -> type1 == type }.toList()

    }

    @GetMapping
    fun showDesignForm(model: Model): String {
        val ingredients = Arrays.asList(
                Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                Ingredient("CARN", "Carnitas", Type.PROTEIN),
                Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                Ingredient("LETC", "Lettuce", Type.VEGGIES),
                Ingredient("CHED", "Cheddar", Type.CHEESE),
                Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                Ingredient("SLSA", "Salsa", Type.SAUCE),
                Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        )
        val types = Type.values()
        for (type in types) {
            model.addAttribute(
                    type.toString().toLowerCase(),
                    filterByType(ingredients, type)
            )
        }
        model.addAttribute("design", Taco())
        return "design"
    }
}
