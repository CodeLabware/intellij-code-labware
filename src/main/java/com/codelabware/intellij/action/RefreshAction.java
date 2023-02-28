package com.codelabware.intellij.action;

import com.codelabware.intellij.message.CodeLabwareBundle;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAwareAction;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @author LiLittleCat
 * @link <a href="https://github.com/LiLittleCat">https://github.com/LiLittleCat</a>
 * @since 2023/02/28
 */
public class RefreshAction extends DumbAwareAction {
    public RefreshAction(@NotNull @Nls String text) {
        super(() -> text, AllIcons.Actions.Refresh);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        ToolWindowManager instance = ToolWindowManager.getInstance(Objects.requireNonNull(e.getProject()));
        ToolWindow toolWindow = instance.getToolWindow(CodeLabwareBundle.message("plugin.name"));
        if (toolWindow != null) {
            ContentManager contentManager = toolWindow.getContentManager();
//            Content browserContent = contentManager.findContent(ChatGPTBundle.message("browser.tab.name"));
//            if (browserContent != null) {
//                contentManager.removeContent(browserContent, false);
        }
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
//            @SuppressWarnings("DialogTitleCapitalization")
//            Content browser = contentFactory.createContent(new ChatGPTToolWindow().getContent(),
//                    ChatGPTBundle.message("browser.tab.name"), false);
//            contentManager.addContent(browser);
//            contentManager.setSelectedContent(browser);
    }
}
