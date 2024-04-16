import React from 'react';
import styled from 'styled-components';

export interface InputProps {
  variant: 'text' | 'email' | 'password';
}

const StyledInput = styled.div``;

export const Input: React.FC<InputProps> = ({ variant }) => {
  const inputType =
    variant === 'text'
      ? 'text'
      : variant === 'email'
      ? 'email'
      : variant === 'password'
      ? 'password'
      : 'default';

  const inputPlaceholder =
    variant === 'text'
      ? 'Digite o texto aqui'
      : variant === 'email'
      ? 'Digite o email'
      : variant === 'password'
      ? 'Digite a senha'
      : 'default';

  return (
    <StyledInput>
      <input type={inputType} placeholder={inputPlaceholder} />
    </StyledInput>
  );
};

export default Input;
