import { createSlice } from "@reduxjs/toolkit";

export type UserId = number

const initialState: UserId = 0

const userIdSlice = createSlice({
    name: 'userId',
    initialState,
    reducers: {
        saveUserId(state, action) {
            // axios 요청 넣기
        },
    }
})

export const {
    saveUserId
} = userIdSlice.actions;

export default userIdSlice.reducer;