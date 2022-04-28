package tech.antibytes.kmock.example

import tech.antibytes.util.test.annotations.IgnoreJs
import tech.antibytes.util.test.annotations.RobolectricConfig
import tech.antibytes.util.test.annotations.RobolectricTestRunner
import tech.antibytes.util.test.annotations.RunWithRobolectricTestRunner
import tech.antibytes.util.test.fixture.fixture
import tech.antibytes.util.test.fixture.kotlinFixture
import tech.antibytes.util.test.mustBe
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals

@RobolectricConfig(manifest = "--none")
@RunWithRobolectricTestRunner(RobolectricTestRunner::class)
class Base64Spec {
    val fixture = kotlinFixture()

    @Test
    @JsName("fn0")
    fun `Given a things dependend on Robolectric it works in common code`() {
        // Given
        val data = "The quick brown fox jumps over the lazy dog"

        // When
        val actual = Base64.encode(data.encodeToByteArray())

        // Then
        actual mustBe fixture.fixture()
    }
}
