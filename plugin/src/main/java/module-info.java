/**
 * @author VISTALL
 * @since 24/01/2023
 */
module consulo.intellij.experiment.icons {
    requires consulo.ide.api;

    provides consulo.ui.image.IconLibraryDescriptor with
        consulo.intellij.experiment.icons.LightNewIconLibraryDescriptor,
        consulo.intellij.experiment.icons.DarkNewIconLibraryDescriptor;
}