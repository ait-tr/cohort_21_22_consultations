import { createStore, combineReducers } from 'redux';
import { composeWithDevTools } from 'redux-devtools-extension';
import counterReducer from './features/counter/counterReducer';
import userReducer from './features/user/userReducer';

const store = createStore(
  combineReducers({
    counter: counterReducer,
    user: userReducer,
  }),
  composeWithDevTools()
);

export default store;
export type RootState = ReturnType<typeof store.getState>;
