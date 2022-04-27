package tech.antibytes.kmock.example

import tech.antibytes.util.test.annotations.RobolectricConfig
import tech.antibytes.util.test.annotations.RobolectricTestRunner
import tech.antibytes.util.test.annotations.RunWithRobolectricTestRunner
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals

@RobolectricConfig(manifest = "--none")
@RunWithRobolectricTestRunner(RobolectricTestRunner::class)
class Base64Spec {
    @Test
    @JsName("fn0")
    fun `Given a things dependend on Robolectric it works in common code`() {
        // Given
        val data = "The quick brown fox jumps over the lazy dog"

        // When
        val actual = Base64.encode(data.encodeToByteArray())

        // Then
        assertEquals(
            expected = "VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZw==",
            actual = actual,
        )
    }
}
