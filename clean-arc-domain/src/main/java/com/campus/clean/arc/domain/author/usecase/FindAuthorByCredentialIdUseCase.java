package com.campus.clean.arc.domain.author.usecase;

import com.campus.clean.arc.domain.author.entity.AuthorEntity;
import com.campus.clean.arc.domain.author.port.AuthorRepository;
import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.IdInputValues;
import com.rcore.domain.commons.usecase.model.SingletonOptionalEntityOutputValues;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindAuthorByCredentialIdUseCase extends UseCase<IdInputValues<String>, SingletonOptionalEntityOutputValues<AuthorEntity>> {
    private final AuthorRepository authorRepository;

    @Override
    public SingletonOptionalEntityOutputValues<AuthorEntity> execute(IdInputValues<String> stringIdInputValues) {
        return SingletonOptionalEntityOutputValues.of(authorRepository.findByCredentialId(stringIdInputValues.getId()));
    }
}
