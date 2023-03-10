package com.codelabware.intellij.ui.window;

import com.codelabware.intellij.message.CodeLabwareBundle;
import com.codelabware.intellij.view.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.EditorTextField;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentManager;
import org.jetbrains.annotations.NotNull;

/**
 * @author <a href="https://github.com/LiLittleCat">LiLittleCat</a>
 * @since 2023/2/26
 */
public class CodeLabwareToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentManager contentManager = toolWindow.getContentManager();

//        Content labelContent = contentManager.getFactory().createContent(new Editor(project, Editor.JSON_FILE_TYPE), CodeLabwareBundle.message("plugin.name"), false);
        Content labelContent = contentManager.getFactory().createContent(new EditorTextField(project, Editor.JSON_FILE_TYPE), CodeLabwareBundle.message("plugin.name"), false);
        contentManager.addContent(labelContent);
//        // add actions to tool window
//        List<AnAction> anActionList = new ArrayList<>();
//        anActionList.add(new SettingsAction("Settings"));
//        anActionList.add(new RefreshAction("Refresh"));
//        toolWindow.setTitleActions(anActionList);
    }
}
