import assertk.assertThat
import assertk.assertions.isTrue
import kotlin.test.Test

class TestMyClazz {
    @Test
    fun `true should be true`() {
        assertThat(true).isTrue();
    }
}