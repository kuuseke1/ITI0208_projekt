<template>
    <div>
        <h3> {{ msg }} </h3>
        <form id="exercise-form" @submit.prevent="addExercise">
            Select exercise:<br>
            <label>
                <select name="name" v-model="name">
                    <option value="Push-up">Push-up</option>
                    <option value="Burpee">Burpee</option>
                    <option value="Squat">Squat</option>
                    <option value="Grunches">Grunches</option>
                </select>
            </label><br>
            Select repetitions:<br>
            <input name="repetitions" type="radio" id="one" value="One" v-model="repetitions">
            <label for="one">One</label>
            <br>
            <input name="repetitions" type="radio" id="two" value="Two" v-model="repetitions">
            <label for="two">Two</label>
            <br>

            <input type="submit" value="Add exercise" class="btn">
            <br>
            <span>Picked: {{ repetitions }}</span>
            <span>Selected: {{ name }}</span>
        </form>
    </div>
</template>

<script>

    import axios from 'axios';

    export default {
        name: "AddExercise",
        data() {
            return {
                name: '',
                repetitions: '',
                msg: '',
            }
        },
        methods: {
            addExercise() {
                //this.$emit('addExercise', newExercise);
                axios
                    .post('http://localhost:8081/workouts', {
                        name: this.name,
                        repetitions: this.repetitions,
                    })
                    .then((response => {
                        if (response.status === 200) {
                            this.msg = "Exercise was added";
                        } else {
                            this.msg = "Something went wrong";
                        }
                    }));
            },
        },
    };
</script>

<style scoped>


</style>