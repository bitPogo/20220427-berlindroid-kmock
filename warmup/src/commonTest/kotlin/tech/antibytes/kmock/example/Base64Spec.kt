package tech.antibytes.kmock.example

import kotlin.js.JsName
import kotlin.test.Test
import tech.antibytes.kfixture.fixture
import tech.antibytes.kfixture.kotlinFixture
import tech.antibytes.util.test.annotations.RobolectricConfig
import tech.antibytes.util.test.annotations.RobolectricTestRunner
import tech.antibytes.util.test.annotations.RunWithRobolectricTestRunner
import tech.antibytes.util.test.isNot

@RobolectricConfig(manifest = "--none")
@RunWithRobolectricTestRunner(RobolectricTestRunner::class)
class Base64Spec {
    val fixture = kotlinFixture()

    @Test
    @JsName("fn0")
    fun `Given a things dependent on Robolectric it works in common code`() {
        // Given
        val data = "The quick brown fox jumps over the lazy dog"

        // When
        val actual = Base64.encode(data.encodeToByteArray())

        // Then
        actual isNot fixture.fixture()
    }
}
