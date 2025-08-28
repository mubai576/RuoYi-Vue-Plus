package io.github.mubai576.common.translation.core.impl;

import io.github.mubai576.common.core.service.UserService;
import io.github.mubai576.common.translation.annotation.TranslationType;
import io.github.mubai576.common.translation.constant.TransConstant;
import io.github.mubai576.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;

/**
 * 用户名翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.USER_ID_TO_NAME)
public class UserNameTranslationImpl implements TranslationInterface<String> {

    private final UserService userService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof Long id) {
            return userService.selectUserNameById(id);
        }
        return null;
    }
}
