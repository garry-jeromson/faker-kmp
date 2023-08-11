package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.exception.UnsupportedPathException
import io.spherelabs.blahblahfake.internal.resolver
import io.spherelabs.blahblahfake.path.EducatorPath
import io.spherelabs.blahblahfake.path.Path
import io.spherelabs.blahblahyaml.provider.YamlProvider

internal class EducatorProvider(
    private val yamlProvider: YamlProvider
) : Provider {

    override fun get(path: Path): String {
        return when (path) {
            is EducatorPath -> resolver { yamlProvider.get(path.value) }
            else -> throw UnsupportedPathException(path)
        }
    }
}
