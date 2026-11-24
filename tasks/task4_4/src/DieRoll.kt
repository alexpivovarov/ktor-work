import kotlinx.serialization.Serializable
import kotlin.random.Random

@Serializable  /*tells the compiler plugin (serialization: enabled in module.yaml) to generate the code that converts this class to and from JSON. */
class DieRoll(val sides: Int) {
    val result: Int /*declares a result without giving it a value yet */

    /*runs automatically every time a DieRoll is created */
    init {
        require(sides in setOf(4, 6, 8, 10, 12, 20)) {"Invalid sides"} /* validation part */
        result = Random.nextInt(sides) + 1  /* gives a random number 0 to sides - 1, so for a d6 that's 0-5 */
    }
}