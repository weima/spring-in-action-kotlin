package sia.tacocloud.model

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Taco(

        // end::allButValidation[]
        @NotNull
        @Size(min = 5, message = "Name must be at least 5 characters long")
        // tag::allButValidation[]
        val name: String? = null,
        // end::allButValidation[]
        @Size(min = 1, message = "You must choose at least 1 ingredient")
        // tag::allButValidation[]
        val ingredients: List<String>? = null

)